import br.ufpb.dce.sinval.Cardinality;
import br.ufpb.dce.sinval.Entity;
import br.ufpb.dce.sinval.EntityType;
import br.ufpb.dce.sinval.Relation;
import br.ufpb.dce.sinval.RelationType;

public class Test {

	@org.junit.Test
	public void createAnOneToManyRelationchipBetweenProfessorAndStudent() {
		EntityType professorType = new EntityType("professor");
		Entity professorRodrigo = new Entity(professorType);

		EntityType studentType = new EntityType("student");
		Entity studentSinval = new Entity(studentType);

		RelationType professorHasManyStudentsRelationType = new RelationType(
				"professorHasManyStudents", professorType, studentType,
				Cardinality.ONE, Cardinality.MANY);

		Relation rodrigoIsSinvalsProfessor = new Relation(
				professorHasManyStudentsRelationType, professorRodrigo,
				studentSinval);
	}

}
