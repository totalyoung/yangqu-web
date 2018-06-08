package com.yangqu.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.lang.Nullable;

/**
 * Created by yangst on 2018/6/7.
 */

public class DynamicDatabaseTypeSource extends AbstractRoutingDataSource{


    @Nullable
    @Override
    protected Object determineCurrentLookupKey() {
        return DatabaseTypeHolder.getDatabaseType();
    }
}
