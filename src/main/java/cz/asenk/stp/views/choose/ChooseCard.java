package cz.asenk.stp.views.choose;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChooseCard {
    private String image;
    private String name;
    private String description;
}
