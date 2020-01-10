package file;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class ToDo implements Serializable {
	private String toDoId;
	private String toDoName;
	private LocalDate Date;
	public ToDo( String toDoName, LocalDate date) {
		super();
		this.toDoId=UUID.randomUUID().toString();
		this.toDoId = toDoId;
		this.toDoName = toDoName;
		Date = date;
	}
	

}
