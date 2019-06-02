package com.github.bohnman.squiggly.extension.servlet;

import com.github.bohnman.squiggly.extension.support.GenericExtension;
import com.github.bohnman.squiggly.runtime.SquigglyRuntimeInitializer;
import com.github.bohnman.squiggly.extension.servlet.support.RequestParameterFilterProvider;

import javax.annotation.Nullable;

public class ServletExtension extends GenericExtension {

    @Override
    protected void doApply(SquigglyRuntimeInitializer<?> builder) {
        builder.filter(new RequestParameterFilterProvider(getFilterParam()) {
            @Override
            protected String customizeFilter(@Nullable String filter, @Nullable Class<?> objectClass) {
                return super.customizeFilter(filter, objectClass);
            }
        });
    }

    protected String getFilterParam() {
        return RequestParameterFilterProvider.DEFAULT_NAME;
    }

}