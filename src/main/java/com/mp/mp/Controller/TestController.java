// package com.mp.mp.Controller;

// import java.util.List;

// import com.mp.mp.Model.TestModel;
// import com.mp.mp.Services.TestService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// @RequestMapping("test")
// public class TestController {
//     @Autowired private TestService testService;

// 	@GetMapping("all")
// 	public List<TestModel> get() {
// 		return testService.getAll();
// 	}

//     @PostMapping("store")
// 	public int post(@RequestBody(required = true) TestModel testModel) throws Exception {
// 		return testService.create(testModel);
// 	}

//     @PostMapping("update")
// 	public int put(@RequestBody(required = true) TestModel testModel) throws Exception {
// 		return testService.update(testModel);
// 	}

//     @PostMapping("destroy")
// 	public int delete(@RequestBody(required = true) TestModel testModel) throws Exception{
// 		return testService.delete(testModel);
// 	}
// }