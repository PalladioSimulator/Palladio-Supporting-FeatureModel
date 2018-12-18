package de.uka.ipd.sdq.featureinstance;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class FeatureModelInstancePlugin extends AbstractUIPlugin {
    /**
     * The constructor.
     */
    public FeatureModelInstancePlugin() {
        super();
    }

    /*/**
     * Returns the shared instance.

	public static FeatureModelInstancePlugin getDefault() {
		return plugin;
	}*/

    /**
     * Returns the workspace instance.
     */
    public static IWorkspace getWorkspace() {
        return ResourcesPlugin.getWorkspace();
    }

    public static ImageDescriptor getImageDescriptor(final String name) {
        final String iconPath = "icons/";
        try {
            final URL installURL = Platform.getBundle("de.uka.ipd.sdq.featureinstance.editor").getEntry("/");
            final URL url = new URL(installURL, iconPath + name);
            return ImageDescriptor.createFromURL(url);
        } catch (final MalformedURLException e) {
            return ImageDescriptor.getMissingImageDescriptor();
        }
    }
}
