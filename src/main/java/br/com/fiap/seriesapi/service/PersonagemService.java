package br.com.fiap.seriesapi.service;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.seriesapi.data.PersonagemDao;
import br.com.fiap.seriesapi.model.Personagem;

public class PersonagemService {
    PersonagemDao dao = new PersonagemDao();

    public List<Personagem> findAll() throws ClassNotFoundException {
        try {
            return dao.findAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Personagem findById(Long id) throws ClassNotFoundException {
        try {
            return dao.findById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void delete(Personagem personagem) throws ClassNotFoundException {
        try {
            dao.delete(personagem);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean create(Personagem personagem) throws ClassNotFoundException {
        if (!validate(personagem)) return false;
        try {
            dao.create(personagem);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean update(Personagem personagem) throws ClassNotFoundException {
        if (!validate(personagem)) return false;
        try {
            dao.update(personagem);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    private boolean validate(Personagem personagem) {
        if (personagem.nome().isEmpty()) return false;
        if (personagem.especie().isEmpty()) return false;
        return true;
    }
}
