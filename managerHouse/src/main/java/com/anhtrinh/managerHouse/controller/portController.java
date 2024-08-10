package com.anhtrinh.managerHouse.controller;

import com.anhtrinh.managerHouse.entity.port;
import com.anhtrinh.managerHouse.service.portService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/port")
public class portController {
    @Autowired
    private portService portService;

    @GetMapping
    public ResponseEntity<List<port>> getAllPorts() {
        List<port> ports = portService.getAllPort();
        return ResponseEntity.ok(ports);
    }

    @GetMapping("/{id}")
    public ResponseEntity<port> getPortById(@PathVariable int id){
        port port = portService.getPortById(id);
        if (port !=null){
            return ResponseEntity.ok(port);
        }else{
            return ResponseEntity.notFound().build();
        }
    }


    @PostMapping
    public ResponseEntity<port> addStudent(@RequestBody port port){
        port.setId(0); // bat buoc them moi va phat sinh ra id
        port = portService.addPort(port);
        return ResponseEntity.status(HttpStatus.CREATED).body(port);
    }

    @PutMapping("/{id}")
    public ResponseEntity<port> updateStudent(@PathVariable int id, @RequestBody port port){
        port existingPort = portService.getPortById(id);
        if (existingPort!=null){
            existingPort.setImage(port.getImage());
            existingPort.setTitle(port.getTitle());
            existingPort.setDescription(port.getDescription());
            existingPort.setAddress(port.getAddress());
            existingPort.setStatus(port.getStatus());
            portService.updatePort(existingPort);
            return ResponseEntity.ok(existingPort);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public  ResponseEntity<Void> deletePort(@PathVariable int id){
        port existingPort = portService.getPortById(id);
        if (existingPort!=null){
            portService.deletePortById(id);
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }


}
