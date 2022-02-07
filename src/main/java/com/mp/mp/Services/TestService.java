// package com.mp.mp.Services;

// import com.mp.mp.Dao.TestRepository;
// import com.mp.mp.Model.TestModel;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.List;

// @Service
// public class TestService {
//     @Autowired private TestRepository testRepository;

//     public List<TestModel> getAll (){
//         return (List<TestModel>) testRepository.findAll();
//     }

//     public int create(TestModel testModel) throws Exception{
//         try{
//             testRepository.save(testModel);
//             return 1;
//         }catch(Exception e){
//             return 0;
//         }
//     }
  
//     public int update(TestModel testModel){
//         try{
//             testRepository.save(testModel);
//             return 1;
//         }catch(Exception e){
//             return 0;
//         }
//     }
    
//     public int delete(TestModel testModel){
//         try{
//             testRepository.deleteById(testModel.getId());
//             return 1;
//         }catch(Exception e){
//             return 0;
//         }
//     }

//     // public List<TestModel> getLabel(){
//     //     return (List<TestModel>) testRepository.GetLabel();
//     // }
// }
