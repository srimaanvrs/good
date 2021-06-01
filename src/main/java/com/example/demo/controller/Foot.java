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
public class Foot {
    @Autowired
    service red;

    @RequestMapping("/review")
    public List<Noot> findall()
    {
        return red.find();
    }
    @PostMapping("/update")
    public Noot updateall(@RequestBody Noot ff)
    {
        return red.update(ff);
    }
    @GetMapping("/review/{id}")
    public ResponseEntity<Noot> getsid(@PathVariable(value = "id") Integer a) {
        try {
            Noot noo = red.getid(a);
            return new ResponseEntity<Noot>(noo, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Noot>(HttpStatus.NOT_FOUND);
        }
    }
        @DeleteMapping("/{id}")
        public void delete(@PathVariable(value = "id")  Integer p)
        {
            red.Delete(p);
            Method();
        }
        public String Method()
        {
            return "Successfully deleted";
        }

   @PutMapping("/review/{id}")
   public Noot updateid(@PathVariable(value = "id") Integer b,@RequestBody Noot no)
    {
       return red.get(b,no);
    }
    @GetMapping("/{id}/{d}")
    public String finds(@PathVariable(value = "id") Integer b, @PathVariable(value = "d")String h)
    {
        return red.ring(b,h);
    }

}
