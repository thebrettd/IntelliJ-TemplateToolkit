package com.brett.lang.templatetoolkit;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import org.jetbrains.annotations.NotNull;

public class TemplateToolkitLanguage extends Language {
    public static final TemplateToolkitLanguage INSTANCE = new TemplateToolkitLanguage();

    public TemplateToolkitLanguage() {
        super("TemplateToolkit", "text/plain", "text/html", "application/javascript");
        SyntaxHighlighterFactory.LANGUAGE_FACTORY.addExplicitExtension(this, new SingleLazyInstanceSyntaxHighlighterFactory() {
            @NotNull
            protected SyntaxHighlighter createHighlighter() {
                return new TemplateToolkitHighlighter();
            }
        });
    }


}
