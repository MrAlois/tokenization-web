package cz.asenk.stp.views.choose;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.AfterNavigationEvent;
import com.vaadin.flow.router.AfterNavigationObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import java.util.Arrays;
import java.util.List;

import lombok.val;

@PageTitle("Choose")
@Route(value = "choose")
@RouteAlias(value = "")
public class ChooseView extends Div {
    private VerticalLayout menuLayout;

    public ChooseView() {
        addClassName("choose-view");
        setSizeFull();
        createMenuLayout();

        add(menuLayout);
    }

    private void createMenuLayout() {
        menuLayout = new VerticalLayout();

        HorizontalLayout firstLine = new HorizontalLayout();
        firstLine.setMaxWidth(menuLayout.getWidth());
        firstLine.addAndExpand(createCard("BankCard"));
        firstLine.addAndExpand(createCard("OpusCard"));

        HorizontalLayout secondLine = new HorizontalLayout();
        secondLine.add(createCard("Litacka"));
        secondLine.add(createCard("Mobile"));
        secondLine.add(createCard("Sms"));

        menuLayout.add(firstLine, secondLine);
    }

    private VerticalLayout createCard(String title) {
        VerticalLayout cardLayout = new VerticalLayout();
        cardLayout.addClassName("card");

//        Image image = new Image("path/to/image.jpg", "Image");
//        image.setWidth("200px");

        Label titleLabel = new Label(title);
        titleLabel.addClassName("card-title");

        Text descriptionText = new Text("Description goes here.");
//        descriptionText.addClassName("card-description");

        cardLayout.add(/*image,*/ titleLabel, descriptionText);

        // Add click listener to the card
        cardLayout.addClickListener(e -> {
            cardLayout.setVisible(false);
        });

        return cardLayout;
    }
}
