package com.brett.lang.templatetoolkit;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class TemplateToolkitFileType extends LanguageFileType {

    @NonNls
    public static final String DEFAULT_EXTENSION = "tt";
    private static final String DESCRIPTION = "Template Toolkit File";
    @NonNls public static final String DOT_DEFAULT_EXTENSION = "."+ DEFAULT_EXTENSION;

    public static final LanguageFileType INSTANCE = new TemplateToolkitFileType();

    private TemplateToolkitFileType(){
        super(TemplateToolkitLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "TemplateToolkit";
    }

    @NotNull
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return AllIcons.FileTypes.Html;
    }
}
