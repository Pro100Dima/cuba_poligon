package com.company.cubapoligon.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubapoligon.entity.Product;

@UiController("cubapoligon_Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class ProductBrowse extends MasterDetailScreen<Product> {
}