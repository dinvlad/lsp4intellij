package com.github.lsp4intellij.contributors.inspection;

import com.intellij.codeInspection.LocalInspectionTool;
import org.intellij.lang.annotations.Pattern;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/*
 * This is used just to register a local inspection tool provider. LSPInspection
 * is used to handle inspections, after receiving diagnostics
 */
public class DummyLSPInspection extends LocalInspectionTool {

    @NotNull
    @Override
    public String getDisplayName() {
        return getShortName();
    }

    @Override
    public JComponent createOptionsPanel() {
        return new LSPInspectionPanel("LSP", this);
    }

    @NotNull
    @Override
    public String getShortName() {
        return "LSP";
    }

    @NotNull
    @Override
    @Pattern("[a-zA-Z_0-9.-]+")
    public String getID() {
        return "LSP";
    }

    @NotNull
    @Override
    public String getGroupDisplayName() {
        return "LSP";
    }

    @Override
    public String getStaticDescription() {
        return "Reports errors by the LSP server";
    }

    @Override
    public boolean isEnabledByDefault() {
        return true;
    }
}
