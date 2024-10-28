package com.company.cinema.view.infovalue;

import com.company.cinema.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.core.LoadContext;
import io.jmix.core.SaveContext;
import io.jmix.datatoolsflowui.view.entityinfo.model.InfoValue;
import io.jmix.flowui.view.*;

import java.util.Set;

@Route(value = "infoValues/:id", layout = MainView.class)
@ViewController("datatl_InfoValue.detail")
@ViewDescriptor("info-value-detail-view.xml")
@EditedEntityContainer("infoValueDc")
public class InfoValueDetailView extends StandardDetailView<InfoValue> {

    @Install(to = "infoValueDl", target = Target.DATA_LOADER)
    private InfoValue customerDlLoadDelegate(final LoadContext<InfoValue> loadContext) {
        Object id = loadContext.getId();
        // Here you can load the entity by id from an external storage.
        // Set the loaded entity to the not-new state using EntityStates.setNew(entity, false).
        return null;
    }

    @Install(target = Target.DATA_CONTEXT)
    private Set<Object> saveDelegate(final SaveContext saveContext) {
        InfoValue entity = getEditedEntity();
        // Here you can save the entity to an external storage and return the saved instance.
        // Set the returned entity to the not-new state using EntityStates.setNew(entity, false).
        // If the new entity ID is assigned by the storage, set the ID to the original instance too 
        // to let the framework match the saved instance with the original one.
        InfoValue saved = entity;
        return Set.of(saved);
    }
}
