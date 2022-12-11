package com.nri.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nri.model.Reservation;

//To Inform spring framework that this class is used for Database Operations
@Repository
public class ReservationDaoImpl implements ReservationDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	int result;
	@Override
	@Transactional
	public int rcrInsert(Reservation robj) {

		result = (Integer)this.hibernateTemplate.save(robj);
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	@Override
	@Transactional
	public void rcrUpdate(Reservation robj, int pid) {

		this.hibernateTemplate.update(robj);
	}

	@Override
	@Transactional
	public void rcrDelete(int pid) {
		Reservation r = this.hibernateTemplate.get(Reservation.class, pid);
		this.hibernateTemplate.delete(r);
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public Reservation rcrSearchByPid(int pid) {
		Reservation r =this.hibernateTemplate.get(Reservation.class, pid);
		return r;
	}

	@Override
	public List<Reservation> rcrAllBook() {
		
		List<Reservation> listobj = this.hibernateTemplate.loadAll(Reservation.class);
		return listobj;
	}

	
}
/*
We can capture the checked values in controller and store in pojo/model class as a object and 
finally store in to the database using hibernate.

The primary key attribute with the @GeneratedValue annotation and set GenerationType.SEQUENCE as 
the strategy. This tells Hibernate to use a database sequence to generate the primary key value. 
If you don’t provide any additional information, Hibernate will use its default sequence.

You can configure the name and schema of the database sequence with a @SequenceGenerator 
annotation like the one you can see in the following code snippet.

@Entity
public class Reservation {
 
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_generator")
    @SequenceGenerator(name="author_generator", sequenceName = "author_seq")
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
     
    ...
     
}
*/