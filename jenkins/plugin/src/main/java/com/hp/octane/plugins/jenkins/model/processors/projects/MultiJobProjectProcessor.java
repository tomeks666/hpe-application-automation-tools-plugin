package com.hp.octane.plugins.jenkins.model.processors.projects;

import com.tikal.jenkins.plugins.multijob.MultiJobProject;
import hudson.model.AbstractProject;
import hudson.tasks.Builder;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: gullery
 * Date: 24/12/14
 * Time: 13:40
 * To change this template use File | Settings | File Templates.
 */

public class MultiJobProjectProcessor extends AbstractProjectProcessor {


    public MultiJobProjectProcessor(AbstractProject project) {
        super(project);
        //  Internal phases
        //
        super.processBuilders(((MultiJobProject) this.project).getBuilders(), this.project);

        //  Post build phases
        //
        super.processPublishers(this.project);
    }

    @Override
    public List<Builder> tryGetBuilders() {
        return ((MultiJobProject) project).getBuilders();
    }
}
