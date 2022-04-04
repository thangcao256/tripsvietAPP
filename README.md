# TripsViet - Ứng dụng review du lịch Việt Nam
![tripsviet](https://i.ibb.co/XxVB8ry/1024.png)

Đây là ứng dụng Mobile mình viết - phục vụ cho đồ án Chuyên ngành Công nghệ thông tin
Công cụ, Ngôn ngữ sử dụng:
* Java
* Firebase (Authentication & Realtime Database)
* PHP
* MySQL

## Màn hình chờ
Đây là màn hình khởi động của Ứng dụng TRIPSVIET
    
![tripsviet](https://i.ibb.co/r2HqvVW/1.jpg)

Màn hình giới thiệu được xuất hiện, khi ứng dụng được cài đặt lần đầu tiên trên thiết bị. Lần truy cập ứng dụng thứ hai sẽ được bỏ qua, nếu người dùng đã đăng xuất tài
khoản khỏi ứng dụng.
    
![tripsviet](https://i.ibb.co/2qky2Kt/2.jpg)

## Chức năng đăng nhập
Chức năng đăng nhập yêu cầu người dùng nhập số điện thoại và mật khẩu đã đăng ký để
xác thực đăng nhập. Người dùng có thể ghi nhớ đăng nhập cho lần sử dụng tiếp theo. Bên cạnh đó, ứng dụng hỗ trợ người dùng có thể đăng ký tài khoản mới hoặc tìm lại mật khẩu cho tài khoản đã đăng ký trước đó.
    
![tripsviet](https://i.ibb.co/CKfVthY/3.jpg)

## Chức năng đăng ký tài khoản
Ở chức năng đăng ký tài khoản, ứng dụng yêu cầu người dùng xác thực số điện thoại dùng để đăng ký bằng mã OPT.
* Nếu số điện thoại đã được đăng ký trước đó, ứng dụng cho phép người dùng lấy lại mật khẩu cũ hoặc trở về trang đăng nhập.
* Nếu số điện thoại chưa được đăng ký trước, ứng dụng xác thực mã OTP đúng, yêu cầu người dùng điền thông tin về họ tên, mật khẩu. Sau đó xác nhận đăng ký thành công.

![tripsviet](https://i.ibb.co/Rc1fkw2/4.jpg)
    
Tương tự như chức năng đăng ký tài khoản:
*	Nếu số điện thoại được đăng ký trước, ứng dụng xác thực mã OTP đúng, yêu cầu người dùng nhập lại mật khẩu mới. Sau đó xác nhận thành công.
*	Nếu số điện thoại đã chưa được đăng ký trước đó, ứng dụng cho phép người dùng đi đến chức năng đăng ký tài khoản hoặc trở về trang đăng nhập.

![tripsviet](https://i.ibb.co/rpH8H9v/6.jpg)

Ở màn hình này, người dùng có thể xem danh sách các bài viết đã được quản trị viên xét duyệt, mặc định ở phần “Dành cho bạn”. Ở phần “Đang theo dõi” là bài viết của những người dùng khác mà họ đã theo dõi.
Ngoài ra, ứng dụng hỗ trợ người dùng tìm kiếm những bài viết theo tên địa điểm…
    
![tripsviet](https://i.ibb.co/rpH8H9v/6.jpg)
    
## Chức năng tìm kiếm
Ứng dụng cho phép người dùng tìm kiếm gần đúng hoặc đúng với từ khóa do người dùng 
nhập vào. Ứng dụng sẽ hỗ trợ hiện thị những địa điểm gợi ý trong lúc người dùng nhập
dữ liệu để tìm kiếm vào.

![tripsviet](https://i.ibb.co/7GgQGnS/7.jpg)
    
## Chức năng tương tác
Ở chức năng này, người dùng có thể xem được chi tiết bài viết, thu phóng hình ảnh bài viết, truy cập đến trang cá nhân của người khác, thả tim, bình luận hoặc
xem được thông tin tất cả các bình luận trên bài viết
    
![tripsviet](https://i.ibb.co/TktvGkT/8.jpg)

Ở giao diện này, người dùng có thể theo dõi/ hủy theo dõi người dùng khác, xem thông 
tin giới thiệu, ảnh đại diện, ảnh bìa,… Cùng với đó là danh sách các bài viết của họ.
    
![tripsviet](https://i.ibb.co/DRvy0d3/9.jpg)

## Chức năng thêm bài viết
Còn ở chức năng Thêm bài viết, ứng dụng yêu cầu người dùng cung cấp thông tin về 
địa điểm đó như Tên địa điểm, địa chỉ, mô tả cũng như cảm nhận của người dùng 
về địa điểm du lịch đó…
Ngoài ra, ứng dụng cho phép người dùng định vị địa điểm của địa điểm đó trên bản đồ
, cùng với đánh giá theo thang điểm 5 tương ứng với mô tả. Sau cùng, ứng dụng bắt buộc cung cấp ít nhất 4 hình ảnh về địa điểm, để tiến hành đăng bài viết.

![tripsviet](https://i.ibb.co/PFz8pSy/10.jpg)
    
## Chức năng khám phá
Ở giao diện Khám phá, khi người dùng nhấn vào một tỉnh thành nào đó, ứng dụng sẽ 
cung cấp thông tin về tỉnh thành. Ví dụ, vị trí địa lý, diện tích, dân số, biển số xe phương tiện. Bên cạnh đó, ứng dụng gợi ý thêm các địa điểm tham quan nổi tiếng,
cũng như món ăn đặc sản hấp dẫn du khách, được đội ngũ quản trị viên tìm hiểu,
cập nhật thường xuyên,..Cuối cùng, là danh sách tất cả các bài viết ở địa phương đó
, cập nhật từ những người dùng khác.

![tripsviet](https://i.ibb.co/XzfqDJ9/11.jpg)

## Chức năng gợi ý vị trí
Ở chức năng Xung quanh, ứng dụng sử dụng vị trí hiện tại của người dùng. Từ đó đưa ra các gợi ý gần cho người dùng, ví dụ như các địa điểm tham quan, ăn uống,
hay giải trí,…được lấy từ thông tin các bài viết của người dùng, cùng với sự tìm kiếm của những quản trị viên ứng dụng, 
để cung cấp cho người dùng những thông tin hữu ích nhất.
    
![tripsviet](https://i.ibb.co/Bncd0qR/12.jpg)

## Chức năng đọc báo
Ở giao diện này, hệ thống cung cấp cho người dùng, những bài viết, bài báo về Du lịch, được cập nhật hằng ngày. Một chức năng khá hữu ích cho những tín đồ đam mê về du lịch, cung cấp thông tin hay ho về nền du lịch nước nhà nói riêng
và du lịch thế giới nói chung.
    
![tripsviet](https://i.ibb.co/SsLbph9/13.jpg)

## Chức năng cài đặt 
Ở chức năng này, ứng dụng cho phép người dùng:
*	Cập nhật thông tin
*	Xem được những Bài viết chưa duyệt
*	Thanh toán, đổi điểm từ việc đăng bài viết
*	Đánh giá sản phẩm
*	Cũng như tìm kiếm sự trợ giúp từ ứng ụng.

![tripsviet](https://i.ibb.co/TPBXmxK/14.jpg)

Chức năng cho phép người dùng thay đổi các thông tin của cá nhân như Ảnh đại diện, Ảnh bìa, Họ và tên, Ngày tháng năm sinh, Giới tính, Email, Quê Quán, Tiểu sử…Sau khi điền đầy đủ các thông tin, nhấn Xác nhận để hoàn thành thao tác.
    
 ![tripsviet](https://i.ibb.co/L8KgYVy/15.jpg)   
 
Ở chức năng này, người dùng được xem lại bài chưa được quản trị viên duyệt sau khi
đăng bài thành công. Những bài viết chưa duyệt sẽ tạm thời chưa xuất hiện trên công động, cũng như trong trang cá nhân của người dùng.
    
![tripsviet](https://i.ibb.co/9h4BpYF/16.jpg)

## Chức năng đánh giá ứng dụng
Chức năng đánh giá ứng dụng
    
![tripsviet](https://i.ibb.co/jbCKbh6/17.jpg)

## Chức năng thay đổi giao diện, mật khẩu
Chức năng cho phép người dùng có thể tùy chọn giao diện sáng hoặc tối để phù hợp với nhu cầu, môi trường sử dụng của người dùng. Đồng thời, đi kèm hai ngôn ngữ, để ứng dụng hướng đến đối tượng không chỉ người Việt Nam sử dụng. Ngoài ra còn có chức năng Đổi mật khẩu, yêu cầu người dùng nhập mật khẩu cũ và mật khẩu mới để tiến hành xác nhận thao tác.
    
![tripsviet](https://i.ibb.co/kyLkxm3/18.jpg)

## Video Demo
{@vimeo: https://www.youtube.com/watch?v=C0LdAo1WhAU}


# TripsViet - Ứng dụng review du lịch Việt Nam



    
    
    



    
