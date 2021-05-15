package hu.pte.ttk.vaadin.vaadindemo.menu;

import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import hu.pte.ttk.vaadin.vaadindemo.security.SecurityUtils;

public class MenuComponent extends HorizontalLayout {

    public MenuComponent() {
        Anchor main = new Anchor();
        main.setText("Main page");
        main.setHref("/");
        add(main);

        Anchor link = new Anchor();
        link.setText("Car page");
        link.setHref("/car");
        add(link);

        Anchor manufacture = new Anchor();
        manufacture.setText("Manufacturer page");
        manufacture.setHref("/manufacturer");
        add(manufacture);

        if(SecurityUtils.isAdmin()){
            Anchor user = new Anchor();
            user.setText("Users page");
            user.setHref("/user");
            add(user);
        }

        Anchor logout = new Anchor();
        logout.setText("Log out");
        logout.setHref("/logout");
        add(logout);
    }
}
