package gpa.backend;

import java.io.Serializable;

public record MsUserDto(Integer id, String name) implements Serializable {
}
