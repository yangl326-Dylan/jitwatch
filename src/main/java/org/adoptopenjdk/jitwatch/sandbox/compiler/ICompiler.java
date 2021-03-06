/*
 * Copyright (c) 2013-2015 Chris Newland.
 * Licensed under https://github.com/AdoptOpenJDK/jitwatch/blob/master/LICENSE-BSD
 * Instructions: https://github.com/AdoptOpenJDK/jitwatch/wiki
 */
package org.adoptopenjdk.jitwatch.sandbox.compiler;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.adoptopenjdk.jitwatch.sandbox.ISandboxLogListener;

public interface ICompiler
{
	public boolean compile(List<File> sourceFiles, List<String> classpathEntries, File outputDir, ISandboxLogListener logListener) throws IOException;
}