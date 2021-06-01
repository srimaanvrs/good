package com.example.demo.controller;

import com.example.demo.model.Noot;
import com.example.demo.model.order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
@RestController
public class ordercontrol {
    
        @Autowired
        orderservice red;

        @RequestMapping("/orderreview")
        public List<order> findall()
        {
            return red.find();
        }
        @PostMapping("/orderupdate")
        public order updateall(@RequestBody order ff)
        {
        return red.update(ff);
        }
        @GetMapping("/orederreview/{id}")
        public ResponseEntity<order> getsid(@PathVariable(value = "id") Integer a) {
            try {
                order noo = red.getid(a);
                return new ResponseEntity<order>(noo, HttpStatus.OK);
            } catch (NoSuchElementException e) {
                return new ResponseEntity<order>(HttpStatus.NOT_FOUND);
            }
        }
        @DeleteMapping("/order/{id}")
        public void delete(@PathVariable(value = "id")  Integer p)
        {
            red.Delete(p);
            Method();
        }
        public String Method()
        {
            return "Successfully deleted";
        }

        @PutMapping("/orderreview/{id}/{id}")
        public order updateid(@PathVariable(value = "id") Integer b,@PathVariable(value = "id") Integer c)
        {
            return red.get(b,c);
        }
        @GetMapping("/order/{id}/{d}")
        public String finds(@PathVariable(value = "id") Integer b, @PathVariable(value = "d")String h)
        {
            return red.ring(b,h);
        }
    }
