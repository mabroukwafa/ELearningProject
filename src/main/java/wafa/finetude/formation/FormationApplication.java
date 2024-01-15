package wafa.finetude.formation;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import wafa.finetude.formation.entities.Admin;
import wafa.finetude.formation.entities.AttributionFormation;
import wafa.finetude.formation.entities.Employe;
import wafa.finetude.formation.entities.Formateur;
import wafa.finetude.formation.entities.Formation;

@SpringBootApplication
public class FormationApplication implements CommandLineRunner {

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(FormationApplication.class, args);
	}

	@Override
	public void run(final String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Admin.class);
		repositoryRestConfiguration.exposeIdsFor(Formateur.class);
		repositoryRestConfiguration.exposeIdsFor(Employe.class);
		repositoryRestConfiguration.exposeIdsFor(Question.class);
		repositoryRestConfiguration.exposeIdsFor(Formation.class);
		repositoryRestConfiguration.exposeIdsFor(AttributionFormation.class);

	}
}
