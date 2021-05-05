package com.example.springrest_fullstrack_todommvc_vuejs.Todo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {
    private  final  TodoRepository stockRepository;
    public List<Todo> findAll(){
        return  stockRepository.findAll();
    }
    public  List<Todo> saveAll(List<Todo> todos){
        return stockRepository.saveAll(todos);
    }
}
