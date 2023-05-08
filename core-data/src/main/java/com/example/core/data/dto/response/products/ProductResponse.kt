package com.example.core.data.dto.response.products

import com.google.gson.annotations.SerializedName

data class ProductResponse(
    @SerializedName("added") var added: Int? = null,
    @SerializedName("addedby") var addedby: String? = null,
    @SerializedName("age_restriction") var ageRestriction: Int? = null,
    @SerializedName("alcohol_percentage") var alcoholPercentage: String? = null,
    @SerializedName("alcohol_registry_number") var alcoholRegistryNumber: String? = null,
    @SerializedName("batches") var batches: String? = null,
    @SerializedName("brand_id") var brandId: Int? = null,
    @SerializedName("cashier_must_enter_price") var cashierMustEnterPrice: Int? = null,
    @SerializedName("category_id") var categoryId: Int? = null,
    @SerializedName("changed") var changed: Int? = null,
    @SerializedName("changedby") var changedby: String? = null,
    @SerializedName("code") var code: String? = null,
    @SerializedName("code2") var code2: String? = null,
    @SerializedName("code3") var code3: String? = null,
    @SerializedName("code5") var code5: String? = null,
    @SerializedName("code6") var code6: String? = null,
    @SerializedName("code7") var code7: String? = null,
    @SerializedName("code8") var code8: String? = null,
    @SerializedName("cost") var cost: Int? = null,
    @SerializedName("country_of_origin_id") var countryOfOriginId: Int? = null,
    @SerializedName("delivery_time") var deliveryTime: String? = null,
    @SerializedName("deposit_fee_amount") var depositFeeAmount: Int? = null,
    @SerializedName("deposit_fee_id") var depositFeeId: Int? = null,
    @SerializedName("description") var description: Description? = Description(),
    @SerializedName("displayed_in_webshop") var displayedInWebshop: Int? = null,
    @SerializedName("excise_declaration_number") var exciseDeclarationNumber: String? = null,
    @SerializedName("extra_field1_id") var extraField1Id: Int? = null,
    @SerializedName("extra_field2_id") var extraField2Id: Int? = null,
    @SerializedName("extra_field3_id") var extraField3Id: Int? = null,
    @SerializedName("extra_field4_id") var extraField4Id: Int? = null,
    @SerializedName("family_id") var familyId: Int? = null,
    @SerializedName("gross_weight") var grossWeight: Int? = null,
    @SerializedName("group_id") var groupId: Int? = null,
    @SerializedName("group_package_metal") var groupPackageMetal: Int? = null,
    @SerializedName("group_package_paper") var groupPackagePaper: Int? = null,
    @SerializedName("group_package_plastic") var groupPackagePlastic: Int? = null,
    @SerializedName("group_package_wood") var groupPackageWood: Int? = null,
    @SerializedName("has_serial_numbers") var hasSerialNumbers: Int? = null,
    @SerializedName("height") var height: Int? = null,
    @SerializedName("id") var id: Int? = null,
    @SerializedName("is_gift_card") var isGiftCard: Int? = null,
    @SerializedName("is_regular_gift_card") var isRegularGiftCard: Int? = null,
    @SerializedName("labels_not_needed") var labelsNotNeeded: Int? = null,
    @SerializedName("length") var length: Int? = null,
    @SerializedName("location_in_warehouse_id") var locationInWarehouseId: Int? = null,
    @SerializedName("location_in_warehouse_text") var locationInWarehouseText: String? = null,
    @SerializedName("manufacturer_name") var manufacturerName: String? = null,
    @SerializedName("name") var name: Name? = Name(),
    @SerializedName("net_weight") var netWeight: Int? = null,
    @SerializedName("non_discountable") var nonDiscountable: Int? = null,
    @SerializedName("non_refundable") var nonRefundable: Int? = null,
    @SerializedName("non_stock_product") var nonStockProduct: Int? = null,
    @SerializedName("packaging_type") var packagingType: String? = null,
    @SerializedName("packing_not_required") var packingNotRequired: Int? = null,
    @SerializedName("parent_product_id") var parentProductId: Int? = null,
    @SerializedName("price") var price: Int? = null,
    @SerializedName("price_with_tax") var priceWithTax: Int? = null,
    @SerializedName("priority_group_id") var priorityGroupId: Int? = null,
    @SerializedName("product_reorder_multiples") var productReorderMultiples: Int? = null,
    @SerializedName("reward_points_not_allowed") var rewardPointsNotAllowed: Int? = null,
    @SerializedName("sales_package_cardboard") var salesPackageCardboard: Int? = null,
    @SerializedName("sales_package_clear_brown_glass") var salesPackageClearBrownGlass: Int? = null,
    @SerializedName("sales_package_green_other_glass") var salesPackageGreenOtherGlass: Int? = null,
    @SerializedName("sales_package_metal_al") var salesPackageMetalAl: Int? = null,
    @SerializedName("sales_package_metal_fe") var salesPackageMetalFe: Int? = null,
    @SerializedName("sales_package_other_metal") var salesPackageOtherMetal: Int? = null,
    @SerializedName("sales_package_plastic_pet") var salesPackagePlasticPet: Int? = null,
    @SerializedName("sales_package_plastic_pp_pe") var salesPackagePlasticPpPe: Int? = null,
    @SerializedName("sales_package_wood") var salesPackageWood: Int? = null,
    @SerializedName("sold_in_packages") var soldInPackages: Int? = null,
    @SerializedName("status") var status: String? = null,
    @SerializedName("suggested_retail_price") var suggestedRetailPrice: Int? = null,
    @SerializedName("supplier_code") var supplierCode: String? = null,
    @SerializedName("supplier_id") var supplierId: Int? = null,
    @SerializedName("tax_free") var taxFree: Int? = null,
    @SerializedName("tax_rate_id") var taxRateId: Int? = null,
    @SerializedName("transport_package_cardboard") var transportPackageCardboard: Int? = null,
    @SerializedName("transport_package_plastic") var transportPackagePlastic: Int? = null,
    @SerializedName("transport_package_wood") var transportPackageWood: Int? = null,
    @SerializedName("type") var type: String? = null,
    @SerializedName("unit_id") var unitId: Int? = null,
    @SerializedName("volume") var volume: Int? = null,
    @SerializedName("width") var width: Int? = null
)