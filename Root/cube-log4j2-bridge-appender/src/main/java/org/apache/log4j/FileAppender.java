package org.apache.log4j;

import org.apache.log4j.spi.ErrorHandler;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;

public class FileAppender implements Appender {
	
	public FileAppender(Layout layout, String sFilePath) {
	}

	@Override
	public void addFilter(Filter newFilter) {
	}

	@Override
	public Filter getFilter() {
		return null;
	}

	@Override
	public void clearFilters() {
	}

	@Override
	public void close() {
	}

	@Override
	public void doAppend(LoggingEvent event) {
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public void setErrorHandler(ErrorHandler errorHandler) {
	}

	@Override
	public ErrorHandler getErrorHandler() {
		return null;
	}

	@Override
	public void setLayout(Layout layout) {
	}

	@Override
	public Layout getLayout() {
		return null;
	}

	@Override
	public void setName(String name) {
	}

	@Override
	public boolean requiresLayout() {
		return false;
	}

}
