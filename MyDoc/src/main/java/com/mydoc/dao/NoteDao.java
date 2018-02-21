package com.mydoc.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mydoc.beans.Note;

public class NoteDao extends AbstractDao {


	/**
	 * Update a note
	 * @param note
	 */
	public void insertNote(Note note) {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			session.save(note);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) 
				tx.rollback();
			e.printStackTrace(); 
		} finally {
			session.close();
		}
	}

	/**
	 * Update a given note
	 * @param note
	 */
	public void updateNote(Note note) {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			session.update(note);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) 
				tx.rollback();
			e.printStackTrace(); 
		} finally {
			session.close();
		}
	}

}