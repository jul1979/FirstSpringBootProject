package heb.esi.webg548982.business;

import com.google.common.collect.Lists;
import heb.esi.webg548982.Model.Task;
import heb.esi.webg548982.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository  taskRepository;

    public List<Task> tasks(){
        return Lists.newArrayList(taskRepository.findAll());
    }
}
