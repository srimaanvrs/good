package com.example.demo.controller;
import com.example.demo.Repository.Res;
import com.example.demo.Repository.Respond;
import com.example.demo.model.Noot;
import com.example.demo.model.order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class service
{
    @Autowired
    Respond red;

    public List<Noot> find()
    {
        return red.findAll();
    }
    public Noot update(Noot ff)
    {
        return red.save(ff);
    }
    public Noot getid(Integer a)
    {
        return red.findById(a).get();
    }
  public Noot get(Integer h,Noot no)
    {
        Noot f;
        f = getid(h);
        f.setName(no.getName());
        f.setRating(no.getRating());
        Noot tt=red.save(f);
        return tt;
    }
    public void Delete(Integer r)
{
    red.deleteById(r);
}
public String ring(Integer g,String h)
{
    Noot f;
    f = getid(g);
    int j = f.getRating();
    if(h.equals(f.getName()))
    {
        return Integer.toString(j);
    }
    return "id not found";
}
}
