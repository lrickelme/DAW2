package br.edu.ifpb.es.daw;

import br.edu.ifpb.es.daw.dao.EmpregadoDAO;
import br.edu.ifpb.es.daw.dao.impl.EmpregadoDAOImpl;
import br.edu.ifpb.es.daw.entities.Empregado;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class MainEmpregadoDelete {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			EmpregadoDAO dao = new EmpregadoDAOImpl(emf);
			Empregado empregado = new Empregado();
			empregado.setNome("Rick");
			empregado.setSobrenome("L");
			empregado.setCpf("000.000.000-00" + System.nanoTime());
			empregado.setDataNascimento(LocalDate.now());

			dao.save(empregado);
			System.out.println(empregado);
		}
	}

}
