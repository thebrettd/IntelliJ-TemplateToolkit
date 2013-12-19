package com.brett.lang.templatetoolkit;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class TemplateToolkitFileTypeFactory extends FileTypeFactory {

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(TemplateToolkitFileType.INSTANCE, TemplateToolkitFileType.DEFAULT_EXTENSION);
    }
}
