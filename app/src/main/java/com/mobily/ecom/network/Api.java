package com.mobily.ecom.network;




import com.mobily.ecom.ui.home.product.response.LatestResponse;

import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

	@GET("v1/products/latest")
	Single<LatestResponse> homeLatest();

//
//	@POST("LoginUser")
//	Single<LoginResponse> login(@Body LoginRequest loginRequest);
//
//	@Multipart
//	@POST("RegisterUser")
//	Single<RegisterResponse> register(@Part("email") RequestBody email,
//									  @Part("password") RequestBody password,
//									  @Part("name") RequestBody name,
//									  @Part("phone") RequestBody phone,
//									  @Part("address") RequestBody address,
//									  @Part("projectname") RequestBody projectname,
//									  @Part("area") RequestBody area,
//									  @Part("description") RequestBody description,
//									  @Part("lat") RequestBody lat,
//									  @Part("lng") RequestBody lng,
//									  @Part("country_id") RequestBody country_id,
//									  @Part("city_id") RequestBody city_id,
//									  @Part("flat_area") RequestBody flat_area,
//									  @Part("manager_name") RequestBody manager_name,
//									  @Part("manager_phone") RequestBody manager_phone,
//									  @Part("manager_address") RequestBody manager_address,
//									  @Part("manager_email") RequestBody manager_email,
//									  @Part("manager_password") RequestBody manager_password,
//									  @Part("device_id") RequestBody deviceId,
//									  @Part MultipartBody.Part image);
//
//	@Multipart
//	@POST("RegisterUser")
//	Single<RegisterResponse> registerWithOutAdmin(@Part("email") RequestBody email,
//												  @Part("password") RequestBody password,
//												  @Part("name") RequestBody name,
//												  @Part("phone") RequestBody phone,
//												  @Part("address") RequestBody address,
//												  @Part("projectname") RequestBody projectname,
//												  @Part("area") RequestBody area,
//												  @Part("description") RequestBody description,
//												  @Part("lat") RequestBody lat,
//												  @Part("lng") RequestBody lng,
//												  @Part("country_id") RequestBody country_id,
//												  @Part("city_id") RequestBody city_id,
//												  @Part("flat_area") RequestBody flat_area,
//												  @Part("device_id") RequestBody deviceId,
//												  @Part MultipartBody.Part image);
//
//
//	//ForGetPasswored
//	@POST("forget_pass")
//	Single<ForgetResponse> forgetPass(@Body ForgetPassRequest forgetPassRequest);
//
//	@POST("confirm_code")
//	Single<ForgetResponse> checkCodePass(@Body CheckCode confirmPassRequest);
//
//	@POST("ChangePass")
//	Single<ForgetResponse> forgetNewPass(@Body ConfirmPassRequest confirmPassRequest);
//
//    //Home
//	@POST("MainCategories")
//	Observable<MainResponse> getMainCategories(@Header("lang") String lang,
//											   @Body MainSearch request);
//
//	@POST("MainCategoriesList")
//	Single<MainCategoryWithoutPagination> getMainCategoriesWithoutPagination(@Header("lang") String lang);
//
//	//search
//	@POST("MainCategories")
//	Observable<MainResponse> searchMainCategories(@Header("lang") String lang,
//												  @Body SearchRequest request);
//
//	@POST("SubCategories")
//	Observable<SubCategoryMainResponse> getSubCategories(@Header("lang") String lang,
//														 @Body SubCategoriesRequest request);
//
//	//hash
//	@POST("SubCategories")
//	Observable<SunCategoryWithoutPaginationModel> getSubCategoriesWithoutPagination(@Header("lang") String lang,
//																					@Body SubCategoriesRequest request);
//
//
//	@POST("SubCategories")
//	Observable<SubCategoryMainResponse> SearchSubCategories(@Header("lang") String lang,
//															@Body SearchSubCategoriesRequest request);
//
//	@POST("Products")
//	Observable<ProductResponse> getProducts(@Header("lang") String lang,
//											@Body ProductRequest request);
//
//	//Search
//	@POST("Products")
//	Observable<ProductResponse> getProducts(@Header("lang") String lang,
//											@Body SearchProductRequest request);
//
//
//	@Multipart
//	@POST("CreateProject")
//	Single<AddProjectResponse> add_project(@Header("lang") String lang, @Part("projectname") RequestBody projectname,
//										   @Part("area") RequestBody area,
//										   @Part("description") RequestBody description,
//										   @Part("lat") RequestBody lat,
//										   @Part("lng") RequestBody lng,
//										   @Part("country_id") RequestBody country_id,
//										   @Part("city_id") RequestBody city_id,
//										   @Part("flat_area") RequestBody flat_area,
//										   @Part("user_id") RequestBody user_id,
//										   @Part("manager_name") RequestBody manager_name,
//										   @Part("manager_phone") RequestBody manager_phone,
//										   @Part("manager_address") RequestBody manager_address,
//										   @Part("manager_email") RequestBody manager_email,
//										   @Part("manager_password") RequestBody manager_password);
//
//	@Multipart
//	@POST("Profile")
//	Single<SettingsResponse> get_profile_data(@Header("lang") String lang, @Part("id") int Id);
//
//	@Multipart
//	@POST("UpdateUser")
//	Single<EditProfileResponse> edit_profile_data(@Header("lang") String lang,
//												  @Part("user_id") RequestBody user_id,
//												  @Part("name") RequestBody name,
//												  @Part("address") RequestBody address,
//												  @Part("password") RequestBody password,
//												  @Part("phone") RequestBody phone,
//												  @Part MultipartBody.Part image);
//
//	@Multipart
//	@POST("DeleteProject")
//	Single<DeleteResponse> delete_project_by_id(@Header("lang") String lang, @Part("project_id") int project_id);
//
//
//	@Multipart
//	@POST("GetProject")
//	Single<ViewProjectResponse> get_project_by_id(@Header("lang") String lang, @Part("project_id") int project_id);
//
//	@Multipart
//	@POST("UpdateProject")
//	Single<EditProjectResponse> edit_project(@Header("lang") String lang, @Part("projectname") RequestBody projectname,
//											 @Part("area") RequestBody area,
//											 @Part("description") RequestBody description,
//											 @Part("lat") RequestBody lat,
//											 @Part("lng") RequestBody lng,
//											 @Part("manager_name") RequestBody manager_name,
//											 @Part("manager_email") RequestBody manager_email,
//											 @Part("manager_address") RequestBody manager_address,
//											 @Part("manager_phone") RequestBody manager_phone,
//											 @Part("manager_password") RequestBody manager_password,
//											 @Part("user_id") RequestBody user_id,
//											 @Part("project_id") RequestBody project_id,
//											 @Part("country_id") RequestBody country_id,
//											 @Part("city_id") RequestBody city_id,
//											 @Part("flat_area") RequestBody flat_area);
//
//
//	// Cart
//	@Multipart
//	@POST("getCart")
//	Single<CartResponse> get_all_cart(@Header("lang") String lang, @Part("user_id") RequestBody user_id,
//									  @Part("main_category_id") RequestBody main_category_id,
//									  @Part("device_id") RequestBody device_id);
//
//	@Multipart
//	@POST("DeleteCart")
//	Single<DeleteResponse> delete_cart(@Header("lang") String lang, @Part("user_id") RequestBody user_id,
//									   @Part("id") RequestBody cart_id,
//									   @Part("device_id") RequestBody device_id);
//
//	@GET("StoreCart/")
//	Single<AddProductToCartResponse> addProductToCart(
//			@Header("lang") String lang,
//			@Query("user_id") String user_id, @Query("main_category_id") int main_category_id,
//			@Query("product_id") int product_id, @Query("count") int count, @Query("device_id") String device_id);
//
//	@GET("ChangeCartCount/")
//	Single<AddProductToCartResponse> changeCartCount(
//			@Header("lang") String lang,
//			@Query("user_id") String user_id, @Query("main_category_id") int main_category_id,
//			@Query("product_id") int product_id, @Query("count") int count, @Query("device_id") String device_id);
//
//	@Multipart
//	@POST("CartCount")
//	Observable<Count_Response> get_CartCount(@Part("user_id") RequestBody user_id,
//											 @Part("device_id") RequestBody device_id);
//
//	//inbox
//	@GET("inbox/")
//	Observable<InboxResponseModel> getInbox(@Header("lang") String lang,
//											@Query("page") int page);
//
//	@POST("search-inbox")
//	Observable<InboxResponseModel> searchInbox(@Header("lang") String lang,
//											   @Body SearchInboxRequest request);
//
//
//	@GET("replies/{inboxId}")
//	Single<DetailsResponse> getInboxDetails(
//			@Header("lang") String lang,
//			@Path("inboxId") int inboxId);
//
//
//	@Multipart
//	@POST("sendReply")
//	Single<SendReplyResponse> sendReply(@Header("lang") String lang,
//										@Part("message") RequestBody messate,
//										@Part("inbox_id") RequestBody inboxId,
//										@Part MultipartBody.Part[] file);
//
//	@GET("replies/{id}")
//	Single<DetailsResponse> getOldReplies(@Header("lang") String lang,
//										  @Path("id") int messate);
//
//	@FormUrlEncoded
//	@POST("PayDetails")
//	Observable<PayDetailsResponse> getPayDetails(@Header("lang") String lang, @Field("user_id") String user_id,
//												 @Field("main_category_id") int main_category_id);
//
//	//Get Projects
//	@POST("GetProjects")
//	Single<ProjectsResponse> get_all_Projects(@Header("lang") String lang, @Body ProjectsRequest request);
//
//	@FormUrlEncoded
//	@Headers("Content-Type: application/x-www-form-urlencoded")
//	@POST("GetProjectsNames")
//	Single<ProjectResponse> get_all_ProjectsByUserId(@Header("lang") String lang, @Field("user_id") int user_id);
//
//	//Store Cart
//	@Multipart
//	@POST("getOrders")
//	Single<OrdersResponse> getOrderByProjectId(@Header("lang") String lang,
//											   @Part("user_id") RequestBody user_id,
//											   @Part("main_category_id") RequestBody main_category_id,
//											   @Part("from_date") RequestBody from_date,
//											   @Part("to_date") RequestBody to_date,
//											   @Part("from_price") RequestBody from_price,
//											   @Part("to_price") RequestBody to_price,
//											   @Part("project_id") RequestBody project_id,
//											   @Part("type") RequestBody type);
//
//	@FormUrlEncoded
//	@POST("OrderDates")
//	Observable<truckResponse> getOrderDates(@Header("lang") String lang, @Field("order_id") int order_id);
//
//
//	@FormUrlEncoded
//	@Headers("Content-Type: application/x-www-form-urlencoded")
//	@POST("ReOrder")
//	Single<reOrderResponse> sendReOrderProject(@Header("lang") String lang, @Field("order_id") int order_id);
//
//	@FormUrlEncoded
//	@POST("Store_Orders")
//	Single<StoreOrderResponse> storeOrder(@Header("lang") String lang, @Field("user_id") String user_id, @Field("main_category_id") int main_category_id,
//										  @Field("project_id") int project_id, @Field("delivery_date") String delivery_date,
//										  @Field("delivery_time_id") String delivery_time,
//										  @Field("is_flexible_time") int isTimeFlexible);
//
//	@FormUrlEncoded
//	@POST("GetProjectsNames")
//	Single<ProjectsNameResponse> getProjectsName(@Header("lang") String lang, @Field("user_id") String user_id);
//
//
//	@Multipart
//	@POST("CancelOrder")
//	Single<CancelResponse> cancelOrderByOrderId(@Header("lang") String lang,
//												@Part("order_id") int order_id);
//
//
//	@GET("logout")
//	Single<LogoutResponse> logoutAccount();
//
//
//	@FormUrlEncoded
//	@Headers("Content-Type: application/x-www-form-urlencoded")
//	@POST("WalletPayment")
//	Single<WalletPaymentResponse> sendWalletPayment(@Header("lang") String lang, @Field("order_id") int order_id);
//
//	@POST("GetWallet")
//	Observable<WalletResponse> get_my_wallet(@Header("lang") String lang, @Body MyWalletRequest myWalletRequest);
//
//	@GET("GetCities")
//	Single<CityResponse> getCities(@Header("lang") String lang);
//
//	@Multipart
//	@POST("GetTowns")
//	Single<TownResponse> getTowns(@Header("lang") String lang, @Part("city_id") int city_id);
//
//	@Multipart
//	@POST("GenerateDeliveryCode")
//	Single<generateCodeResponse> generateDeliveryCode(@Header("lang") String lang,
//													  @Part("order_id") int order_id);
//
//	@Multipart
//	@POST("DeleteDeliveryCode")
//	Single<generateCodeResponse> deleteDeliveryCode(@Header("lang") String lang,
//													@Part("order_id") int order_id);
//
//	@FormUrlEncoded
//	@Headers("Content-Type: application/x-www-form-urlencoded")
//	@POST("ProductReport")
//	Observable<ProductReportModel> get_productReports(@Header("lang") String lang,
//													  @Field("search") String search,
//													  @Field("product_id") String product_id,
//													  @Field("from") String from,
//													  @Field("to") String to);
//
//	@FormUrlEncoded
//	@Headers("Content-Type: application/x-www-form-urlencoded")
//	@POST("PaymentReport")
//	Observable<PaymentReportModel> get_PaymentReports(@Header("lang") String lang, @Field("product_id") String product_id,
//													  @Field("from") String from,
//													  @Field("to") String to);
//
//
//	@GET("ProjectsReport")
//	Observable<ProjectReportResponse> getProjectsReport(@Header("lang") String lang,
//														@Query("page") int page);
//
//	@GET("get-notification")
//	Single<bottomNotificationModel> getNotificationCount(@Header("lang") String lang);
//
//
//	@GET("OrderShare/{orderId}")
//	Single<ShareResponse> getOrderLink(@Header("lang") String lang,
//									   @Path("orderId") int orderId);
//
//	@FormUrlEncoded
//	@Headers("Content-Type: application/x-www-form-urlencoded")
//	@POST("request-amount")
//	Single<AmountResponse> getRequestAmount(@Header("lang") String lang,
//											@Field("amount") int amount,
//											@Field("project_id") int project_id);
//
//
//	@POST("transfer-amount")
//	Single<TransferResponse> getTransferAmount(@Header("lang") String lang,
//											   @Body RequestTransfer requestTransfer);
//
//	@FormUrlEncoded
//	@Headers("Content-Type: application/x-www-form-urlencoded")
//	@POST("ProjectDetailsReport")
//	Single<ProjectDetailsResponse> getProjectDetails(@Header("lang") String lang,
//													 @Field("project_id")  String project_id);
//
//	@POST("shareProjectDetailsReport")
//	Single<ShareProjectDetailsResponse> shareProjectDetails(@Header("lang") String lang,
//															@Body DetailsRequest detailsRequest);
}
