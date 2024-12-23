package tz.co.dbs.quizzle.data.remote.api

import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface QuizApiService {
    @GET("questions.json")
    suspend fun getQuestions(): List<Question>
}