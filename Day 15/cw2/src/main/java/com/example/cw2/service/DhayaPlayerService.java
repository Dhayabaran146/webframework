package com.example.cw2.service;

import com.example.cw2.model.DhayaPlayer;
import com.example.cw2.repository.DhayaPlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DhayaPlayerService {

    @Autowired
    private DhayaPlayerRepo playerRepo;

    public List<DhayaPlayer> getAllPlayers() {
        return playerRepo.findAll();
    }

    public DhayaPlayer getPlayerById(int id) {
        return playerRepo.findById(id).orElse(null);
    }

    public DhayaPlayer addPlayer(DhayaPlayer player) {
        return playerRepo.save(player);
    }
}
