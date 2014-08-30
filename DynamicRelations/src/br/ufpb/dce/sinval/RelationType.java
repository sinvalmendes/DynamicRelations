package br.ufpb.dce.sinval;

import java.util.HashSet;
import java.util.Set;

public class RelationType {

	private String name;
	private EntityType sourceType;
	private EntityType targetType;
	private Cardinality sourceCardinality;
	private Cardinality targetCardinality;
	private Set<Relation> relations;

	public RelationType(String name, EntityType sourceType,
			EntityType targetType, Cardinality sourceCardinality, Cardinality targetCardinality) {
		this.name = name;
		this.sourceType = sourceType;
		this.targetType = targetType;
		this.sourceCardinality = sourceCardinality;
		this.targetCardinality = targetCardinality;
		this.relations = new HashSet<Relation>();
	}
	
	public boolean addRelation(Relation relation){
		return this.relations.add(relation);
	}

}
