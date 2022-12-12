package com.kb.dojooverflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kb.dojooverflow.models.Answer;
import com.kb.dojooverflow.models.Question;
import com.kb.dojooverflow.models.Tag;
import com.kb.dojooverflow.models.TagQuestion;
import com.kb.dojooverflow.repositories.AnswerRepository;
import com.kb.dojooverflow.repositories.QuestionRepository;
import com.kb.dojooverflow.repositories.TagQuestionRepository;
import com.kb.dojooverflow.repositories.TagRepository;

@Service
public class DojoOverflowService {
    private final AnswerRepository answerRepo;
    private final QuestionRepository questionRepo;
    private final TagRepository tagRepo;
    private final TagQuestionRepository tagQuestionRepo;

    public DojoOverflowService(AnswerRepository answerRepo, QuestionRepository questionRepo, TagRepository tagRepo,
            TagQuestionRepository tagQuestionRepo) {
        this.answerRepo = answerRepo;
        this.questionRepo = questionRepo;
        this.tagRepo = tagRepo;
        this.tagQuestionRepo = tagQuestionRepo;
    }

    // Encontrar
    public List<Question> allQuestions(){
        return questionRepo.findAll();
    }

    public Question findQuesById(Long quesId){
        return questionRepo.findQuestionById(quesId);
    }

    public List<Answer> findByQuesId(Long quesId){
        return answerRepo.findByQuestionId(quesId);
    }

    // Crear y Eliminar

    public Tag createTags(String subject){
        Optional<Tag> opTag = tagRepo.findBySubject(subject);
        if (opTag.isPresent()) {
            return opTag.get();
        } else {
            Tag newTag = new Tag(subject);
            return tagRepo.save(newTag);
        }
    }

    public void createQuestionTag(TagQuestion newTagQues){
        tagQuestionRepo.save(newTagQues);
    }

    public Question createQues(String ques){
        Question newQues = new Question(ques);
        return questionRepo.save(newQues);
    }

    public Answer creatAnswer(Answer answer){
        return answerRepo.save(answer);
    }
}

