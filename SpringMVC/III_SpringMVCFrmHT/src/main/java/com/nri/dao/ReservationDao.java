package com.nri.dao;

import java.util.List;

import com.nri.model.Reservation;

public interface ReservationDao {
	
	public int rcrInsert(Reservation robj);
	public void rcrUpdate(Reservation robj,int pid);
	public void rcrDelete(int pid);
	public Reservation rcrSearchByPid(int pid);
	public List<Reservation> rcrAllBook();
	

}
