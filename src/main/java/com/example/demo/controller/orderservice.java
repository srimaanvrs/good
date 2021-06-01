package com.example.demo.controller;

import com.example.demo.Repository.Res;
import com.example.demo.Repository.Respond;
import com.example.demo.model.Noot;
import com.example.demo.model.order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class orderservice {
    
        @Autowired
        Res red;
        @Autowired
        Respond r;

        public List<order> find()
        {
            return red.findAll();
        }
        public order getid(Integer a)
        {
            return red.findById(a).get();
        }
        public order update(order ff)

    {
        return red.save(ff);
    }
        public order get(Integer h,Integer o)
        {
            Noot f= r.getid(h);
            order g=getid(o);
            g.setNot(f);
            order tt=red.save(g);
            return tt;
        }
        public void Delete(Integer r)
        {
            red.deleteById(r);
        }
        public String ring(Integer g,String h)
        {
            order f;
            f = getid(g);
            int j = f.getNo();
            if(h.equals(f.getName()))
            {
                return Integer.toString(j);
            }
            return "id not found";
        }
}
