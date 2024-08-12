package org.zerock.w1.todo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.zerock.w1.todo.dto.TodoDTO;


public class TodoService {


	
	public static final String INSTANCE = null;

	public void register(TodoDTO todoDTO) {
		// DB에 insert
		System.out.println("등록중..."+ todoDTO.toString());
	}

	public List<TodoDTO> getList(){
		// DB에서 select
		
		List<TodoDTO> list = new ArrayList<TodoDTO>();
		
		
		for(int i=0; i<10; i++) {
			TodoDTO dto = new TodoDTO();
			dto.setTno(i);
			dto.setTitle("todo..."+i);
			dto.setDueDate(LocalDate.now());
			list.add(dto);
		}
		
		
		return list;
		
	}
	   public TodoDTO get(int tno) {
		      TodoDTO dto = new TodoDTO();
		      dto.setTno(tno);
		      dto.setTitle("Todo");
		      dto.setDueDate(LocalDate.now());
		      dto.setFinished(true);
		      
		      return dto;
		      
		   }
	   
	
}