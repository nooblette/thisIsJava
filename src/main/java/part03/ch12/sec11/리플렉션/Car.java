package part03.ch12.sec11.리플렉션;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Car {
	@NonNull
	private Model model;
	@NonNull
	private Owner owner;
}
