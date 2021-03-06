package com.techno.controller;

//import com.datastax.driver.core.utils.UUIDs;
//import com.techno.dao.TutorialRepository;
//import com.techno.model.Tutorial;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class TutorialController {
//
//    @Autowired
//    TutorialRepository tutorialRepository;
//
//    @GetMapping("/tutorials")
//    public ResponseEntity<List<Tutorial>> getAllTutorials(@RequestParam(required = false) String title) {
//        return null;
//    }
//
//    @GetMapping("/tutorials/{id}")
//    public ResponseEntity<Tutorial> getTutorialById(@PathVariable("id") String id) {
//        return null;
//    }
//
//    @PostMapping("/tutorials")
//    public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial) {
//        try {
//            Tutorial tut = tutorialRepository.save(new Tutorial(UUIDs.timeBased(), tutorial.getTitle(), tutorial.getDescription(), false));
//            return new ResponseEntity<>(tut, HttpStatus.CREATED);
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
//        }
//    }
//
//    @PutMapping("/tutorials/{id}")
//    public ResponseEntity<Tutorial> updateTutorial(@PathVariable("id") String id, @RequestBody Tutorial tutorial) {
//        return null;
//    }
//
//    @DeleteMapping("/tutorials/{id}")
//    public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") String id) {
//        return null;
//    }
//
//    @DeleteMapping("/tutorials")
//    public ResponseEntity<HttpStatus> deleteAllTutorials() {
//        return null;
//    }
//
//    @GetMapping("/tutorials/published")
//    public ResponseEntity<List<Tutorial>> findByPublished() {
//        return null;
//    }
//
//}