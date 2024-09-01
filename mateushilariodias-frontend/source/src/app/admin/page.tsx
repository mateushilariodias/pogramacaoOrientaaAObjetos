"use client";

import AuthInput from "@/components/common/AuthInput";
import Link from "next/link";
import { useState } from "react";

function admin() {
    const [emailUser, setEmailUser] = useState("");
    const [passwordUser, setPasswordUser] = useState("");

    return (
        <main className="flex flex-col min-h-screen items-center justify-center bg-gray-900 p-5 lg:py-10 lg:px-0">
            <form action="" className="flex flex-col bg-gray-50 py-8 px-6 lg:p-10 rounded-2xl gap-5 text-gray-900 w-full max-w-xl">
                <h1 className="font-bold text-2xl">Login do administrador</h1>
                <AuthInput newState={setEmailUser} htmlForAndNameAndId="emailUser" label="E-mail:" type="email"></AuthInput>
                <AuthInput newState={setPasswordUser} htmlForAndNameAndId="passwordUser" label="Senha:" type="password"></AuthInput>
                <Link href="/dashboard" className="bg-black 0 py-3 font-bold text-white rounded-lg text-center">
                    <strong>Entrar</strong>
                </Link>
            </form>
        </main>
    )
}
export default admin;