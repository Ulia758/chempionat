package ru.netology.chempionat

import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.gotrue.GoTrue

object SupabaseClient {
    val client = createSupabaseClient(
        supabaseUrl = "https://xhcrxprmgzqniollkwsy.supabase.co",
        supabaseKey="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InhoY3J4cHJtZ3pxbmlvbGxrd3N5Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3MDgxNjAxMTksImV4cCI6MjAyMzczNjExOX0.pqOBTnfrydmG0lhxhcnZP4yKajCUBT8UszNuVCMCBog",
    )
    {
        install(GoTrue)
    }
}