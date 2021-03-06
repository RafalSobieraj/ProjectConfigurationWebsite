package com.example.strona.model.switchPOE;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javassist.NotFoundException;

@Service
public class SwitchPOEService {
    
    @Autowired private SwitchPOERepository repository;

    public List<SwitchPOE> listSwitches(){
        return (List<SwitchPOE>) repository.findAll();
    }

    public SwitchPOE save(SwitchPOE switchPOE) {
        return repository.save(switchPOE);
    }

    public SwitchPOE get(Integer id) throws NotFoundException {
        Optional<SwitchPOE> result = repository.findById(id);
        if(result.isPresent()){
            return result.get();
        }
        throw new NotFoundException("Could not find any switches with ID " + id);
    }

    public void delete(Integer id) throws NotFoundException{
        Long count = repository.countById(id);
        if(count == null || count == 0){
            throw new NotFoundException("Could not find and objects with ID " + id);
        }
        repository.deleteById(id);
    }

}
