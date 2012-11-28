package org.evilsoft.pathfinder.reference.render;

public class RaceRenderer extends Renderer {
	public RaceRenderer() {
	}

	@Override
	public String renderTitle() {
		String title = name;
		if (!top) {
			title = title + " Characters";
		}
		return renderTitle(title, abbrev, newUri, depth, top);
	}

	@Override
	public String renderDetails() {
		return "";
	}

	@Override
	public String renderFooter() {
		return "";
	}

	@Override
	public String renderHeader() {
		return "";
	}
}
