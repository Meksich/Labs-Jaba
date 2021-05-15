package ua.lviv.iot.shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.shop.models.Bra;
import ua.lviv.iot.shop.service.BraService;

import java.util.List;

@RestController
@RequestMapping(path = "/bra")
public class BraController {

    @Autowired
    private BraService braService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<Bra> getBra(@PathVariable Integer id){
        Bra bra = braService.getBra(id);
        if (bra != null){
            return ResponseEntity.ok(bra);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping
    public List<Bra> getBras(){
        return braService.getBras();
    }

    @PutMapping
    public Bra createBra(@RequestBody Bra bra){
        braService.addBra(bra);
        return bra;
    }

    @PostMapping(path = "/{id}")
    public ResponseEntity<Bra> updateBra(@PathVariable Integer id, @RequestBody Bra bra){
        Bra updateTarget = braService.getBraMap().get(id);
        if (updateTarget != null) {
            bra.setId(id);
            braService.updateBra(id, bra);
            return ResponseEntity.ok(bra);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deleteBra(@PathVariable Integer id){
        Bra deleteTarget = braService.getBraMap().get(id);
        if (deleteTarget != null){
            braService.deleteBra(id);
            return ResponseEntity.ok("Successfully deleted");
        }
        return ResponseEntity.notFound().build();
    }
}
