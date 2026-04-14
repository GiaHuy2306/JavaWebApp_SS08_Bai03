1. Xác định I/O
Input: Biến withdrawAmount kiểu dữ liệu Long hoặc BigDecimal.

Output: Boolean (true nếu hợp lệ, false nếu vi phạm kèm thông báo lỗi cụ thể).

2. Đề xuất giải pháp
Sử dụng bộ đôi Custom Annotation và ConstraintValidator của thư viện jakarta.validation.

Annotation: @MultipleOfTenThousand dùng để đánh dấu trên các trường cần kiểm tra.

Validator: MultipleOfTenThousandValidator chứa logic kiểm tra chia hết cho 10.000 và lớn hơn 50.000.

3. Sơ đồ logic kiểm tra (Pseudocode)
Logic trong Validator:

Bước 1 (Xử lý bẫy Null): Nếu value == null, trả về true.

Tại sao? Theo Best Practice, việc kiểm tra null thuộc trách nhiệm của @NotNull. Validator này chỉ tập trung vào logic "Bội số".

Bước 2 (Kiểm tra điều kiện 1): Nếu value < 50000, trả về false.

Bước 3 (Kiểm tra điều kiện 2): Nếu value % 10000 != 0, trả về false.

Bước 4: Nếu vượt qua tất cả, trả về true.
