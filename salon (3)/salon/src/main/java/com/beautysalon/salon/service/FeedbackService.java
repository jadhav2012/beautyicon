package com.beautysalon.salon.service;

import java.util.List;

import com.beautysalon.salon.model.Feedback;

public interface FeedbackService {
Feedback insertrecord(Feedback r);
List<Feedback>getAll();
void del(int ri);
Feedback updaterecord(int i,Feedback r);
}
