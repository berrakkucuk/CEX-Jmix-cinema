package com.company.cinema.view.infovalue;

import com.company.cinema.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.core.LoadContext;
import io.jmix.datatoolsflowui.view.entityinfo.model.InfoValue;
import io.jmix.flowui.view.*;

import java.util.Collection;
import java.util.List;

@Route(value = "infoValues", layout = MainView.class)
@ViewController("datatl_InfoValue.list")
@ViewDescriptor("info-value-list-view.xml")
@LookupComponent("infoValuesDataGrid")
@DialogMode(width = "50em")
public class InfoValueListView extends StandardListView<InfoValue> {

    @Install(to = "infoValuesDl", target = Target.DATA_LOADER)
    protected List<InfoValue> infoValuesDlLoadDelegate(LoadContext<InfoValue> loadContext) {
        // Here you can load entities from an external storage.
        // Set the loaded entities to the not-new state using EntityStates.setNew(entity, false).
        return List.of();
    }

    @Install(to = "infoValuesDataGrid.remove", subject = "delegate")
    private void infoValuesDataGridRemoveDelegate(final Collection<InfoValue> collection) {
        for (InfoValue entity : collection) {
            // Here you can remove entities from an external storage
        }
    }
}
