package com.talentoTechGrupo3.redComunitaria.users.services.impl;


import com.talentoTechGrupo3.redComunitaria.users.entities.Explorer;
import com.talentoTechGrupo3.redComunitaria.users.services.IExplorerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExplorerService implements IExplorerService {

    private final IExplorerService explorerService;

    public ExplorerService(IExplorerService explorerService) {
        this.explorerService = explorerService;
    }

    @Override
    public Explorer createExplorer(Explorer explorer) {
        return null;
    }

    @Override
    public List<Explorer> findAllExplorer() {
        return null;
    }

    @Override
    public Explorer findExplorerById(Long id) {
        return null;
    }

    @Override
    public Explorer updateExplorer(Explorer explorer) {
        return null;
    }

    @Override
    public String deleteExplorerById(Long id) {
        return null;
    }
}
