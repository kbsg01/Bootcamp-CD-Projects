package com.kb.dojooverflow.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kb.dojooverflow.models.Question;
import com.kb.dojooverflow.models.Tag;
import com.kb.dojooverflow.models.TagQuestion;
import com.kb.dojooverflow.services.DojoOverflowService;


@Controller
public class DojoOverflowController {
    private final DojoOverflowService DOService;

    public DojoOverflowController(DojoOverflowService dOService) {
        DOService = dOService;
    }

    @GetMapping("/questions")
    public String allQues(Model model){
        List<Question> questions = DOService.allQuestions();
        model.addAttribute("questions", questions);
        return "questions";
    }

    @GetMapping("/questions/new")
    public String newQues(){
        return "newQues";
    }

    @PostMapping("/questions/create")
    public String createQuestion(@RequestParam("question")String question, @RequestParam("subject")String subject){
        System.out.println(subject);
        System.out.println(question);
        String [] tag = subject.split("\\s*,\\s*");
        Question quest =DOService.createQues(question);
        for(String st : tag){
            Tag retTag = DOService.createTags(st);
            DOService.createQuestionTag(new TagQuestion(quest, retTag));
        }
        return "redirect:/questions/";
    }

    
}
