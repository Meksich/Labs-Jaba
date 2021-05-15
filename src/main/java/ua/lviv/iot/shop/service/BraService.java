package ua.lviv.iot.shop.service;

import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import ua.lviv.iot.shop.models.Bra;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Service
@Data
@ApplicationScope
public class BraService {

    private AtomicInteger id = new AtomicInteger(0);
    private Map<Integer, Bra> braMap = new HashMap<Integer, Bra>();

    public Bra addBra(Bra bra){
        Integer braId = id.incrementAndGet();
        bra.setId(braId);
        braMap.put(braId, bra);
        return bra;
    }

    public Bra updateBra(Integer id, Bra bra){
        braMap.put(id, bra);
        return bra;
    }

    public List<Bra> getBras(){
        return braMap.values().stream().collect(Collectors.toList());
    }

    public Bra getBra(Integer id) {
        return braMap.get(id);
    }

    public void deleteBra(Integer id){
        braMap.remove(id);
    }
}
