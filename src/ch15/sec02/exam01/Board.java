package ch15.sec02.exam01;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Board {
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date date;
	

}
